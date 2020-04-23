/*
 * Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.optimizer;

import com.hazelcast.sql.impl.compiler.CompiledFragmentTemplate;
import com.hazelcast.sql.impl.QueryException;
import com.hazelcast.sql.impl.plan.Plan;
import com.hazelcast.sql.impl.plan.node.PlanNode;

/**
 * No-op optimizer.
 */
public class NoOpSqlOptimizer implements SqlOptimizer {
    @Override
    public Plan prepare(String sql) {
        throw QueryException.error("Cannot execute SQL query because \"hazelcast-sql\" module is not in the classpath.");
    }

    @Override
    public boolean canCompile() {
        return false;
    }

    @Override
    public CompiledFragmentTemplate compile(PlanNode node) {
        throw QueryException.error("Cannot compile SQL query because \"hazelcast-sql\" module is not in the classpath.");
    }
}