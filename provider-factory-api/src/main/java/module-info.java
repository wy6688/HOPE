module hope.common.factory.provider.api {
	requires transitive hope.common.provider.conn.api;
	requires transitive hope.common.provider.off2.api;
	requires transitive hope.common.provider.trade2.api;
	requires transitive hope.common.provider.csv.api;
	exports com.nabiki.hope.common.factory.provider;
}