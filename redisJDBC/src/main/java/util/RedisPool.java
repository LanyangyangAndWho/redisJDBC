package util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPool {
	private static JedisPool pool=null;
	static {
		 JedisPoolConfig config =new JedisPoolConfig();
		 config.setMaxIdle(100);//最大空闲数
		 config.setMaxTotal(1024);//最大连接数
		 config.setMinIdle(24);//最小空闲数
		 config.setMaxWaitMillis(10000);//设置连接超时时间毫秒//如果设置为-1则不限制超时时间
		 config.setTestOnBorrow(true);//提前测试连接是否成功
		 pool=new JedisPool(config,"127.0.0.1",6379,10000);//ip地址，端口号，超时时间还可以配置密码有重载的方法
	}
	public static Jedis getJedis() {
		if(pool!=null) {
			return pool.getResource();
		}else {
			return null;
		}
		
	}
	
	public static void close(Jedis jedis) {
		try {
			jedis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
