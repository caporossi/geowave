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
package mil.nga.giat.geowave.datastore.bigtable.metadata;

import mil.nga.giat.geowave.core.store.StoreFactoryOptions;
import mil.nga.giat.geowave.core.store.adapter.AdapterIndexMappingStore;
import mil.nga.giat.geowave.datastore.bigtable.AbstractBigTableStoreFactory;
import mil.nga.giat.geowave.datastore.bigtable.operations.BigTableOperations;
import mil.nga.giat.geowave.datastore.bigtable.operations.config.BigTableOptions;
import mil.nga.giat.geowave.datastore.hbase.metadata.HBaseAdapterIndexMappingStore;

public class BigTableAdapterIndexMappingStoreFactory extends
		AbstractBigTableStoreFactory<AdapterIndexMappingStore>
{
	@Override
	public AdapterIndexMappingStore createStore(
			final StoreFactoryOptions options ) {
		if (!(options instanceof BigTableOptions)) {
			throw new AssertionError(
					"Expected " + BigTableOptions.class.getSimpleName());
		}

		final BigTableOperations bigTableOperations = createOperations((BigTableOptions) options);
		return new HBaseAdapterIndexMappingStore(
				bigTableOperations);
	}
}
