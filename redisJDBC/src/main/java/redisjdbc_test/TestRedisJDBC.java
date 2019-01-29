package redisjdbc_test;
//asdsasadsadsadsadsadsaasdsadasdsadsadsadasadsasadasdsa
import redis.clients.jedis.Jedis;

public class TestRedisJDBC {
	public static void main(String[] args) {
		Jedis redis=new Jedis("localhost",6379);
		//redis.auth("123456");redis的连接密码
			/*System.out.println("ok");*/
			System.out.println(redis.ping());
			redis.set("a", "adas");
			System.out.println(redis.get("a"));
			//redis提供的操作数据库的命令jedis都提供有相对应的方法进行操作
			redis.close();//关闭连接
			//redis.incr("value为数字类型的key")实现redisvalue的自增操作
			//redis.incrBy("value为数字类型的key", 自增指定值)
			
	}
}
