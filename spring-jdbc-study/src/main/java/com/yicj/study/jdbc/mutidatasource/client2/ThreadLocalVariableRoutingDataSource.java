package com.yicj.study.jdbc.mutidatasource.client2;

import com.yicj.study.jdbc.mutidatasource.DataSourceTypeManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ThreadLocalVariableRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceTypeManager.get().toString();
    }
}