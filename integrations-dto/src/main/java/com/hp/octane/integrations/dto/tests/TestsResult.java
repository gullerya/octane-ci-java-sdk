package com.hp.octane.integrations.dto.tests;

import com.hp.octane.integrations.dto.DTOBase;

import java.util.List;

/**
 * Created by gullery on 06/03/2016.
 */

public interface TestsResult extends DTOBase {

	BuildContext getBuildContext();

	TestsResult setBuildContext(BuildContext buildContext);

	List<TestRun> getTestRuns();

	TestsResult setTestRuns(List<TestRun> testRuns);
}
