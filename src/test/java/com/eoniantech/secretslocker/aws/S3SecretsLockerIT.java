/*
 * Copyright 2017 Eonian Technologies.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eoniantech.secretslocker.aws;

import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

/**
 * Integration test suite for the {@link S3SecretsLocker}.
 * 
 * @author Michael Andrews <Michael.Andrews@eoniantech.com>
 * @since 1.0
 */
@RunWith(WildcardPatternSuite.class)
@com.googlecode.junittoolbox.SuiteClasses("S3SecretsLockerIT_*.class")
public class S3SecretsLockerIT {

    static final String S3_BUCKET_NAME
            = "eoniantech-secrets";

    static final String S3_BUCKET_PATH
            = "secrets-locker";

    static final String S3_ENCRYPTED_FILE
            = "secret.txt.encrypted"; 
}
