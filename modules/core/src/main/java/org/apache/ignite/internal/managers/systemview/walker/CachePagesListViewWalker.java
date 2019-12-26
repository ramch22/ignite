/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.managers.systemview.walker;

import java.util.Collections;
import java.util.List;
import org.apache.ignite.internal.util.typedef.F;
import org.apache.ignite.spi.systemview.view.CachePagesListView;
import org.apache.ignite.spi.systemview.view.SystemViewRowAttributeWalker;

/**
 * Generated by {@code org.apache.ignite.codegen.SystemViewRowAttributeWalkerGenerator}.
 * {@link CachePagesListView} attributes walker.
 * 
 * @see CachePagesListView
 */
public class CachePagesListViewWalker implements SystemViewRowAttributeWalker<CachePagesListView> {
    /** Filter key for attribute "cacheGroupId" */
    public static final String CACHE_GROUP_ID_FILTER = "cacheGroupId";

    /** Filter key for attribute "partitionId" */
    public static final String PARTITION_ID_FILTER = "partitionId";

    /** Filter key for attribute "bucketNumber" */
    public static final String BUCKET_NUMBER_FILTER = "bucketNumber";

    /** List of filtrable attributes. */
    private static final List<String> FILTRABLE_ATTRS = Collections.unmodifiableList(F.asList(
        "cacheGroupId", "partitionId", "bucketNumber"
    ));

    /** {@inheritDoc} */
    @Override public List<String> filtrableAttributes() {
        return FILTRABLE_ATTRS;
    }

    /** {@inheritDoc} */
    @Override public void visitAll(AttributeVisitor v) {
        v.accept(0, "cacheGroupId", int.class);
        v.accept(1, "partitionId", int.class);
        v.accept(2, "name", String.class);
        v.accept(3, "bucketNumber", int.class);
        v.accept(4, "bucketSize", long.class);
        v.accept(5, "stripesCount", int.class);
        v.accept(6, "cachedPagesCount", int.class);
    }

    /** {@inheritDoc} */
    @Override public void visitAll(CachePagesListView row, AttributeWithValueVisitor v) {
        v.acceptInt(0, "cacheGroupId", row.cacheGroupId());
        v.acceptInt(1, "partitionId", row.partitionId());
        v.accept(2, "name", String.class, row.name());
        v.acceptInt(3, "bucketNumber", row.bucketNumber());
        v.acceptLong(4, "bucketSize", row.bucketSize());
        v.acceptInt(5, "stripesCount", row.stripesCount());
        v.acceptInt(6, "cachedPagesCount", row.cachedPagesCount());
    }

    /** {@inheritDoc} */
    @Override public int count() {
        return 7;
    }
}
