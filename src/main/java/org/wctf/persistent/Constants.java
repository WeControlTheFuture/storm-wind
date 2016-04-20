package org.wctf.persistent;

public class Constants {

	public static final String TOPOLOGY_NAME = "topology.name";
	public static final String TOPOLOGY_SPOUT_PARALLEL = "topology.spout.parallel";
	
	public static final String KAFKA_SPOUT_NAME = "kafka-spout";
	public static final String KAFKA_SPOUT_TOPIC = "kafka.spout.topic";
	public static final String KAFKA_SPOUT_ZK_SERVER = "kafka.spout.zk.server";
	public static final String KAFKA_SPOUT_ZK_PORT = "kafka.spout.zk.port";
	public static final String KAFKA_SPOUT_PARALLEL_NUM = "kafka.spout.parallel.num";
	public static final String KAFKA_SPOUT_CONSUMER_ADDR = "kafka.spout.consumer.addr";
	
	public static final String FIELD_SPLIT = new String(new char[] { (char) 1 });
	public static final String RECORD_SPLIT = new String(new char[] { (char) 2 });
	
	
	public static final String JDBC_DEFAULT = "jdbc.default";
	public static final String HBASE_PARAM = "hbase.param";
	
	public static final String COMMON_SPLIT = ",";
	public static final String COMMON_JOINER = "_";
	public static final String COMMON_HYPHEN = "-";
	public static final String CACHE_RECORD_SPLIT = "#";
	
}
