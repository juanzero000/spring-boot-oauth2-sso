package com.juanzero.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * Created by jjmendoza on 20/11/2017.
 */
@Configuration
@EnableAuthorizationServer
public class AuthServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.checkTokenAccess("permitAll()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                    .withClient("oauth2_client")
                    .secret("oauth2_client_secret")
                    .scopes("read", "write")
                    .authorizedGrantTypes("authorization_code")
                    .autoApprove(true)
                .and()
                    .withClient("note_app")
                    .secret("note_app_secret")
                    .scopes("notes")
                    .authorizedGrantTypes("authorization_code")
                    .autoApprove(true);
    }
}