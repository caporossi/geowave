/*******************************************************************************
 * Copyright (c) 2013-2017 Contributors to the Eclipse Foundation
 * 
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License,
 * Version 2.0 which accompanies this distribution and is available at
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 ******************************************************************************/
package mil.nga.giat.geowave.datastore.accumulo;

import mil.nga.giat.geowave.core.store.DataStore;
import mil.nga.giat.geowave.core.store.DataStoreOperations;
import mil.nga.giat.geowave.core.store.GenericStoreFactory;
import mil.nga.giat.geowave.core.store.StoreFactoryFamilySpi;
import mil.nga.giat.geowave.core.store.adapter.AdapterIndexMappingStore;
import mil.nga.giat.geowave.core.store.adapter.AdapterStore;
import mil.nga.giat.geowave.core.store.adapter.statistics.DataStatisticsStore;
import mil.nga.giat.geowave.core.store.index.IndexStore;
import mil.nga.giat.geowave.core.store.index.SecondaryIndexDataStore;
import mil.nga.giat.geowave.datastore.accumulo.index.secondary.AccumuloSecondaryIndexDataStoreFactory;
import mil.nga.giat.geowave.datastore.accumulo.metadata.AccumuloAdapterIndexMappingStoreFactory;
import mil.nga.giat.geowave.datastore.accumulo.metadata.AccumuloAdapterStoreFactory;
import mil.nga.giat.geowave.datastore.accumulo.metadata.AccumuloDataStatisticsStoreFactory;
import mil.nga.giat.geowave.datastore.accumulo.metadata.AccumuloIndexStoreFactory;

public class AccumuloStoreFactoryFamily extends
		AbstractAccumuloFactory implements
		StoreFactoryFamilySpi
{
	@Override
	public GenericStoreFactory<DataStore> getDataStoreFactory() {
		return new AccumuloDataStoreFactory();
	}

	@Override
	public GenericStoreFactory<DataStatisticsStore> getDataStatisticsStoreFactory() {
		return new AccumuloDataStatisticsStoreFactory();
	}

	@Override
	public GenericStoreFactory<IndexStore> getIndexStoreFactory() {
		return new AccumuloIndexStoreFactory();
	}

	@Override
	public GenericStoreFactory<AdapterStore> getAdapterStoreFactory() {
		return new AccumuloAdapterStoreFactory();
	}

	@Override
	public GenericStoreFactory<SecondaryIndexDataStore> getSecondaryIndexDataStore() {
		return new AccumuloSecondaryIndexDataStoreFactory();
	}

	@Override
	public GenericStoreFactory<AdapterIndexMappingStore> getAdapterIndexMappingStoreFactory() {
		return new AccumuloAdapterIndexMappingStoreFactory();
	}

	@Override
	public GenericStoreFactory<DataStoreOperations> getDataStoreOperationsFactory() {
		return new AccumuloOperationsFactory();
	}

}
