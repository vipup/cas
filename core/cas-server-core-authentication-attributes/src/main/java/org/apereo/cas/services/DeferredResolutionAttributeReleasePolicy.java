package org.apereo.cas.services;

import org.apereo.cas.authentication.principal.Principal;

import java.util.Map;

public class DeferredResolutionAttributeReleasePolicy extends AbstractRegisteredServiceAttributeReleasePolicy {


    @Override
    public Map<String, Object> getAttributesInternal(Principal principal, Map<String, Object> attributes, RegisteredService service) {
        return null;
    }
}
