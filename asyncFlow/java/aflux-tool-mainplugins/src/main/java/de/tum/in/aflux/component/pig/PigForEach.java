

/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright 2019 Tanmaya Mahapatra
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tum.in.aflux.component.pig;

import de.tum.in.aflux.component.pig.actor.PigForEachActor;
import de.tum.in.aflux.tools.core.AbstractMainExecutor;
import de.tum.in.aflux.tools.core.NodeLaunchType;
import de.tum.in.aflux.tools.core.PropertyInputType;
import de.tum.in.aflux.tools.core.ToolProperty;

public class PigForEach extends AbstractMainExecutor  {
	public static final String NAME="Pig FOREACH";
	static public ToolProperty[] connectionProperties={
			new ToolProperty(PigConstants.SOURCE_ALIAS,"",PropertyInputType.TEXT,null,"The name of the file or directory, with NO single quotes.","",false),
			new ToolProperty(PigConstants.BAG,"",PropertyInputType.TEXT,null,"Bag precedding generate clase","",false),
			new ToolProperty(PigConstants.GENERATE,"",PropertyInputType.TEXT,null,"The load function","",false),
			new ToolProperty(PigConstants.SCHEMA,"",PropertyInputType.TEXT,null,"A schema using the AS keyword, not enclosed in parentheses (see Schemas).","",false),
			new ToolProperty(PigConstants.TARGET_ALIAS,"",PropertyInputType.TEXT,null,"Variable name to get the loaded data and be used in subsequent sentences","",false)
			
	};

	public PigForEach() {
		super(NAME,
				PigForEachActor.class.getCanonicalName(),
				PigForEach.class.getName(),
				1, 
				1,
				NodeLaunchType.LAUNCHED_BY_DATA,
				false,
				connectionProperties);
		this.setColor(PigConstants.COLOR);

	}
}

