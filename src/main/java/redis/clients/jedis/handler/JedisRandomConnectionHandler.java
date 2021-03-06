package redis.clients.jedis.handler;

import java.util.Set;

import redis.clients.host.HostAndPort;
import redis.clients.jedis.Jedis;

public class JedisRandomConnectionHandler extends JedisClusterConnectionHandler {

    public JedisRandomConnectionHandler(Set<HostAndPort> nodes) {
	super(nodes);
    }

    public Jedis getConnection() {
	return getRandomConnection().getResource();
    }

    @Override
	public
    Jedis getConnectionFromSlot(int slot) {
	return getRandomConnection().getResource();
    }
}
