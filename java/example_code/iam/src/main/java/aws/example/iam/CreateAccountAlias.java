/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package iam.src.main.java.aws.example.iam;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest;
import com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult;

/**
 * Creates an alias for an AWS Account
 */
public class CreateAccountAlias {

    public static void main(String[] args) {

        final String USAGE =
            "To run this example, supply an alias\n" +
            "Ex: CreateAccountAlias <alias>\n";

        if (args.length != 1) {
            System.out.println(USAGE);
            System.exit(1);
        }

        String aliasName = args[0];

        final AmazonIdentityManagement iam = AmazonIdentityManagementClientBuilder.defaultClient();

        CreateAccountAliasRequest request = new CreateAccountAliasRequest()
            .withAccountAlias(aliasName);

        CreateAccountAliasResult response = iam.createAccountAlias(request);

        System.out.println("Successfully created account alias: " + aliasName);
    }
}
