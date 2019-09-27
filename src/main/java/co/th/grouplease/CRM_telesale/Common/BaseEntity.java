package co.th.grouplease.CRM_telesale.Common;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;

    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedDate;
    private boolean deleted;


    private Date MTN_CREATE_DATE ;
    private Date MTN_TRN_DATE ;
    private String MTN_TRN_FROM ;
    private String MTN_TERMINAL_ID ;
    private String MTN_PROGRAM_ID ;
    private float MTN_BRANCH_CODE ;
    private String MTN_USER_ID ;
    private Date MTN_DATE_TIME ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return null == this.createdDate ? null : LocalDateTime.ofInstant(this.createdDate.toInstant(), ZoneId.systemDefault());
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = Date.from(createdDate.atZone(ZoneId.systemDefault()).toInstant());
    }

    public LocalDateTime getLastModifiedDate() {
        return null == this.lastModifiedDate ? null : LocalDateTime.ofInstant(this.lastModifiedDate.toInstant(), ZoneId.systemDefault());
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = Date.from(lastModifiedDate.atZone(ZoneId.systemDefault()).toInstant());
    }
}
