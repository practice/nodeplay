// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.nodeplay.node.web;

import org.nodeplay.node.model.AppUser;
import org.nodeplay.node.model.Node;
import org.nodeplay.node.model.NodeRevision;
import org.nodeplay.node.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<AppUser, String> ApplicationConversionServiceFactoryBean.getAppUserToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<org.nodeplay.node.model.AppUser, java.lang.String>() {
            public String convert(AppUser appUser) {
                return new StringBuilder().append(appUser.getName()).append(' ').append(appUser.getDisplayName()).append(' ').append(appUser.getMail()).append(' ').append(appUser.getCreated()).toString();
            }
        };
    }
    
    public Converter<Long, AppUser> ApplicationConversionServiceFactoryBean.getIdToAppUserConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, org.nodeplay.node.model.AppUser>() {
            public org.nodeplay.node.model.AppUser convert(java.lang.Long id) {
                return AppUser.findAppUser(id);
            }
        };
    }
    
    public Converter<String, AppUser> ApplicationConversionServiceFactoryBean.getStringToAppUserConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, org.nodeplay.node.model.AppUser>() {
            public org.nodeplay.node.model.AppUser convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), AppUser.class);
            }
        };
    }
    
    public Converter<Node, String> ApplicationConversionServiceFactoryBean.getNodeToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<org.nodeplay.node.model.Node, java.lang.String>() {
            public String convert(Node node) {
                return new StringBuilder().append(node.getTitle()).append(' ').append(node.getCreated()).append(' ').append(node.getChanged()).toString();
            }
        };
    }
    
    public Converter<Long, Node> ApplicationConversionServiceFactoryBean.getIdToNodeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, org.nodeplay.node.model.Node>() {
            public org.nodeplay.node.model.Node convert(java.lang.Long id) {
                return Node.findNode(id);
            }
        };
    }
    
    public Converter<String, Node> ApplicationConversionServiceFactoryBean.getStringToNodeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, org.nodeplay.node.model.Node>() {
            public org.nodeplay.node.model.Node convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Node.class);
            }
        };
    }
    
    public Converter<NodeRevision, String> ApplicationConversionServiceFactoryBean.getNodeRevisionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<org.nodeplay.node.model.NodeRevision, java.lang.String>() {
            public String convert(NodeRevision nodeRevision) {
                return new StringBuilder().append(nodeRevision.getTitle()).append(' ').append(nodeRevision.getBody()).append(' ').append(nodeRevision.getCreated()).toString();
            }
        };
    }
    
    public Converter<Long, NodeRevision> ApplicationConversionServiceFactoryBean.getIdToNodeRevisionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, org.nodeplay.node.model.NodeRevision>() {
            public org.nodeplay.node.model.NodeRevision convert(java.lang.Long id) {
                return NodeRevision.findNodeRevision(id);
            }
        };
    }
    
    public Converter<String, NodeRevision> ApplicationConversionServiceFactoryBean.getStringToNodeRevisionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, org.nodeplay.node.model.NodeRevision>() {
            public org.nodeplay.node.model.NodeRevision convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), NodeRevision.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAppUserToStringConverter());
        registry.addConverter(getIdToAppUserConverter());
        registry.addConverter(getStringToAppUserConverter());
        registry.addConverter(getNodeToStringConverter());
        registry.addConverter(getIdToNodeConverter());
        registry.addConverter(getStringToNodeConverter());
        registry.addConverter(getNodeRevisionToStringConverter());
        registry.addConverter(getIdToNodeRevisionConverter());
        registry.addConverter(getStringToNodeRevisionConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}