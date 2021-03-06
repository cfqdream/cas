package org.apereo.cas.configuration.model.support.saml.idp.metadata;

import org.apereo.cas.configuration.support.RequiredProperty;
import org.apereo.cas.configuration.support.RequiresModule;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This is {@link FileSystemSamlMetadataProperties}.
 *
 * @author Misagh Moayyed
 * @since 6.4.0
 */
@RequiresModule(name = "cas-server-support-saml-idp")
@Getter
@Setter
@Accessors(chain = true)
@JsonFilter("FileSystemSamlMetadataProperties")
public class FileSystemSamlMetadataProperties implements Serializable {

    private static final long serialVersionUID = -8336473583467202828L;

    /**
     * Directory location of SAML metadata and signing/encryption keys.
     * This directory will be used to hold the configuration files.
     */
    @RequiredProperty
    private String location = "file:/etc/cas/saml";
}
