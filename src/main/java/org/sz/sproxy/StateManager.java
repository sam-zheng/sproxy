/*
 * Copyright (c) 2022 Sam Zheng                                            
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
package org.sz.sproxy;

import java.nio.channels.NetworkChannel;

/**
 * A {@linkplain StateManager} manages the state of a {@linkplain StatefulHandler}.
 * 
 * @author Sam Zheng
 *
 */
public interface StateManager {

	/**
	 * Returns the name of the initial state.
	 * 
	 * @return
	 */
	String getInitState();

	<C extends NetworkChannel, H extends StatefulHandler<C, H>> State<C, H> moveTo(String state, H connection,
			Object initInfo);
}
