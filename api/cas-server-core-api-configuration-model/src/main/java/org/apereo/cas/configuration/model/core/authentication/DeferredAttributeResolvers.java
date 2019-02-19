package org.apereo.cas.configuration.model.core.authentication;

import lombok.Getter;
import lombok.Setter;
import org.apereo.cas.configuration.support.RequiresModule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresModule(name = "cas-server-core-authentication", automated = true)
@Getter
@Setter
public class DeferredAttributeResolvers implements Serializable {

    /**
     * Retrieve attributes from multiple JDBC repositories.
     */
    private List<JdbcPrincipalAttributesProperties> jdbc = new ArrayList();

    /**
     * Retrieve attributes from multiple REST endpoints.
     */
    private List<RestPrincipalAttributesProperties> rest = new ArrayList();

    /**
     * Retrieve attributes from multiple Groovy scripts.
     */
    private List<GroovyPrincipalAttributesProperties> groovy = new ArrayList();

    /**
     * Retrieve attributes from multiple LDAP servers.
     */
    private List<LdapPrincipalAttributesProperties> ldap = new ArrayList();

    /**
     * Retrieve attributes from multiple JSON file repositories.
     */
    private List<JsonPrincipalAttributesProperties> json = new ArrayList();

    /**
     * Retrieve attributes from multiple scripted repositories.
     */
    private List<ScriptedPrincipalAttributesProperties> script = new ArrayList();
}
