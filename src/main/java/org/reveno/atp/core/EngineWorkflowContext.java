/** 
 *  Copyright (c) 2015 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.reveno.atp.core;

import java.util.List;

import org.reveno.atp.core.api.EventPublisher;
import org.reveno.atp.core.api.Journaler;
import org.reveno.atp.core.api.TransactionCommitInfo.Builder;
import org.reveno.atp.core.api.TxRepository;
import org.reveno.atp.core.api.serialization.TransactionInfoSerializer;
import org.reveno.atp.core.engine.WorkflowContext;
import org.reveno.atp.core.engine.components.CommandsManager;
import org.reveno.atp.core.engine.components.TransactionsManager;
import org.reveno.atp.core.views.ViewsProcessor;

public class EngineWorkflowContext implements WorkflowContext {

	@Override
	public List<TransactionInfoSerializer> serializers() {
		return null;
	}

	@Override
	public TxRepository repository() {
		return null;
	}

	@Override
	public ViewsProcessor viewsProcessor() {
		return null;
	}

	@Override
	public TransactionsManager transactionsManager() {
		return null;
	}

	@Override
	public CommandsManager commandsManager() {
		return null;
	}

	@Override
	public EventPublisher eventPublisher() {
		return null;
	}

	@Override
	public Builder transactionCommitBuilder() {
		return null;
	}

	@Override
	public Journaler transactionJournaler() {
		return null;
	}

	@Override
	public long nextTransactionId() {
		return 0;
	}

}
