package redisjdbc_test;

import redis.clients.jedis.Jedis;
import util.RedisPool;

public class TestRedisJDBCPool {
	public static void main(String[] args) {
		Jedis jedis=RedisPool.getJedis();
		jedis.set("key", "asdsa");
		System.out.println(jedis.get("key"));
		RedisPool.close(jedis);
	}
	class a implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
