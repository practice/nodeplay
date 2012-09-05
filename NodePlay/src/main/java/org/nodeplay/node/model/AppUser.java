package org.nodeplay.node.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class AppUser {

    @Column(length = 64)
    private String name;

    private String mail;

    @Column(updatable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private Date created = new Date();

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private Date lastAccess = new Date();

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "S-")
    private Date lastLogin = new Date();

    @Enumerated(EnumType.ORDINAL)
    private UserStatus status;
}
