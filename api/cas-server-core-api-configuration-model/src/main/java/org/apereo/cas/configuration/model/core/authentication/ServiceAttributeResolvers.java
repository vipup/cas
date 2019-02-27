package org.apereo.cas.configuration.model.core.authentication;

import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Lists of Attribute Resolvers that are conditional executed on service validate.
 *
 * @author Travis Schmidt
 * @since 6.1.0
 */
@RequiresModule(name = "cas-server-core-authentication", automated = true)
@Getter
@Setter
public class ServiceAttributeResolvers implements Serializable {

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
