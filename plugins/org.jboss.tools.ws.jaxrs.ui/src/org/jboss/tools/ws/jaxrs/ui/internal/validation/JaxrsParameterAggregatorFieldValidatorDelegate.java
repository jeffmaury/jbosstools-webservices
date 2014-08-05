/******************************************************************************* 
 * Copyright (c) 2008 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Xavier Coulon - Initial API and implementation 
 ******************************************************************************/

package org.jboss.tools.ws.jaxrs.ui.internal.validation;

import org.eclipse.core.runtime.CoreException;
import org.jboss.tools.ws.jaxrs.core.internal.metamodel.domain.JaxrsParameterAggregatorField;

/**
 * @author xcoulon
 *
 */
public class JaxrsParameterAggregatorFieldValidatorDelegate extends JaxrsParameterAggregatorElementValidatorDelegate<JaxrsParameterAggregatorField> {

	/**
	 * Constructor
	 * @param markerManager the underlying marker manager to use
	 */
	public JaxrsParameterAggregatorFieldValidatorDelegate(final IMarkerManager markerManager) {
		super(markerManager);
	}

	@Override
	void internalValidate(final JaxrsParameterAggregatorField aggregatorField) throws CoreException {
		validateNoUnboundPathAnnotationTemplateParameters(aggregatorField);
	}
	
}
