package com.hp.octane.integrations.dto.tests.impl;

import com.hp.octane.integrations.dto.DTOBase;
import com.hp.octane.integrations.dto.DTOFactory;
import com.hp.octane.integrations.dto.DTOInternalProviderBase;
import com.hp.octane.integrations.dto.tests.BuildContext;
import com.hp.octane.integrations.dto.tests.TestRun;
import com.hp.octane.integrations.dto.tests.TestRunError;
import com.hp.octane.integrations.dto.tests.TestsResult;

/**
 * Created by gullery on 10/02/2016.
 *
 * Octane oriented tests results DTOs definitions provider
 */

public final class DTOTestsProvider extends DTOInternalProviderBase {

	public DTOTestsProvider(DTOFactory.DTOConfiguration configuration) {
		dtoPairs.put(BuildContext.class, BuildContextImpl.class);
		dtoPairs.put(TestRunError.class, TestRunErrorImpl.class);
		dtoPairs.put(TestRun.class, TestRunImpl.class);
		dtoPairs.put(TestsResult.class, TestsResultImpl.class);

		xmlAbles.add(BuildContextImpl.class);
		xmlAbles.add(TestRunErrorImpl.class);
		xmlAbles.add(TestRunImpl.class);
		xmlAbles.add(TestsResultImpl.class);
	}

	protected <T extends DTOBase> T instantiateDTO(Class<T> targetType) throws InstantiationException, IllegalAccessException {
		T result = null;
		if (dtoPairs.containsKey(targetType)) {
			result = (T) dtoPairs.get(targetType).newInstance();
		}
		return result;
	}
}
