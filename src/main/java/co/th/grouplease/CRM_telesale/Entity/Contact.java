package co.th.grouplease.CRM_telesale.Entity;

import co.th.grouplease.CRM_telesale.Common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Contact")
@Table(name = "contact")

public class Contact extends BaseEntity {

    private long ContactID ;
    private long ACID ;
    private long AddID ;
    private String Contact_sts ;

    private String addr_desc ;
    private String road ;
    private String addr_no ;
    private String moo ;
    private String soi ;
    private String TUMBON ;
    private String DISTRICT ;
    private String PROVINCE ;
    private String ZIPCODE ;
    private String Email ;
    private String phone1 ;
    private String phone2 ;
    private String phone3 ;
    private String fax ;

    public Contact(long contactID,long ACID, long addID,
                   String contact_sts, String addr_desc,
                   String road, String addr_no, String moo,
                   String soi, String TUMBON, String DISTRICT,
                   String PROVINCE, String ZIPCODE, String email,
                   String phone1, String phone2, String phone3,
                   String fax) {

        this.ContactID = contactID;
        this.ACID = ACID;
        this.AddID = addID;
        this.Contact_sts = contact_sts;
        this.addr_desc = addr_desc;
        this.road = road;
        this.addr_no = addr_no;
        this.moo = moo;
        this.soi = soi;
        this.TUMBON = TUMBON;
        this.DISTRICT = DISTRICT;
        this.PROVINCE = PROVINCE;
        this.ZIPCODE = ZIPCODE;
        this.Email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.fax = fax;
    }
}
