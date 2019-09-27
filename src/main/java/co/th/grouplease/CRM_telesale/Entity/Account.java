package co.th.grouplease.CRM_telesale.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Loader;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Account")
@Table(name = "account")

public class Account {

    @Id
    @GeneratedValue
    private long ACID ;

    private long LID ;
    private String ACtypeID ;
    private String AC_STATUS ;

    private String AC_FIRST_NAME ;
    private String AC_LAST_NAME ;
    private float CONTRACT_NO ;
    private int CARD_ID ;
    private String AC_INFORMATION_TEXT ;
    private int AC_REMAIN_NO ;
    private String AC_COMPANY_NAME ;

    private String CURRENT_OWNER ;
    private String CURRENT_GROUP ;
    private String CURRENT_STATUS ;

    private float TEL_REQ_DOC ;
    private float TEL_DOC_NO ;
    private String TEL_STATUS_FLG ;
    private String TEL_CAMPAINGN ;

    public Account(long ACID, long LID, String ACtypeID, String AC_STATUS,
                   String AC_FIRST_NAME, String AC_LAST_NAME, float CONTRACT_NO,
                   int CARD_ID, String AC_INFORMATION_TEXT, int AC_REMAIN_NO,
                   String AC_COMPANY_NAME, String CURRENT_OWNER, String CURRENT_GROUP,
                   String CURRENT_STATUS, float TEL_REQ_DOC, float TEL_DOC_NO,
                   String TEL_STATUS_FLG, String TEL_CAMPAINGN) {
        this.ACID = ACID;
        this.LID = LID;
        this.ACtypeID = ACtypeID;
        this.AC_STATUS = AC_STATUS;
        this.AC_FIRST_NAME = AC_FIRST_NAME;
        this.AC_LAST_NAME = AC_LAST_NAME;
        this.CONTRACT_NO = CONTRACT_NO;
        this.CARD_ID = CARD_ID;
        this.AC_INFORMATION_TEXT = AC_INFORMATION_TEXT;
        this.AC_REMAIN_NO = AC_REMAIN_NO;
        this.AC_COMPANY_NAME = AC_COMPANY_NAME;
        this.CURRENT_OWNER = CURRENT_OWNER;
        this.CURRENT_GROUP = CURRENT_GROUP;
        this.CURRENT_STATUS = CURRENT_STATUS;
        this.TEL_REQ_DOC = TEL_REQ_DOC;
        this.TEL_DOC_NO = TEL_DOC_NO;
        this.TEL_STATUS_FLG = TEL_STATUS_FLG;
        this.TEL_CAMPAINGN = TEL_CAMPAINGN;
    }
}
