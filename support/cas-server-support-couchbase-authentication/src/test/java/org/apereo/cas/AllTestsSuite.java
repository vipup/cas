package org.apereo.cas;

import org.apereo.cas.authentication.CouchbaseAuthenticationHandlerIntegrationTests;
import org.apereo.cas.authentication.CouchbaseAuthenticationHandlerTests;
import org.apereo.cas.authentication.CouchbasePersonAttributeDaoTests;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@SelectClasses({
    CouchbasePersonAttributeDaoTests.class,
    CouchbaseAuthenticationHandlerTests.class,
    CouchbaseAuthenticationHandlerIntegrationTests.class
})
public class AllTestsSuite {
}
