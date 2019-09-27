package co.th.grouplease.CRM_telesale.Entity;


import co.th.grouplease.CRM_telesale.Common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity(name = "Sms")
@Table(name = "sms")

public class Sms extends BaseEntity {

    private long smsID ;
    private long lead_id ;
    private long ACID ;
    private String Contents ;
    private String PhoneNumber ;
    private String send_status ;
    private String APP ;
    private String source_type ;
    private String Department ;

    public Sms(long smsID,long lead_id,long ACID,String contents,
               String phoneNumber,String send_status,
               String APP,String source_type,String department) {
        this.smsID = smsID;
        this.lead_id = lead_id;
        this.ACID = ACID;
        this.Contents = contents;
        this.PhoneNumber = phoneNumber;
        this.send_status = send_status;
        this.APP = APP;
        this.source_type = source_type;
        this.Department = department;
    }
}
