/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * Change Password Result JSON Unmarshaller
 */
public class ChangePasswordResultJsonUnmarshaller implements Unmarshaller<ChangePasswordResult, JsonUnmarshallerContext> {

    public ChangePasswordResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChangePasswordResult changePasswordResult = new ChangePasswordResult();

        return changePasswordResult;
    }

    private static ChangePasswordResultJsonUnmarshaller instance;
    public static ChangePasswordResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ChangePasswordResultJsonUnmarshaller();
        return instance;
    }
}
    