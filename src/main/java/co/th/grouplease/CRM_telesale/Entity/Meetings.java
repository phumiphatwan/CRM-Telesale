package co.th.grouplease.CRM_telesale.Entity;

import co.th.grouplease.CRM_telesale.Common.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Time;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Meetings")
@Table(name= "meetings")

public class Meetings extends BaseEntity {
    private long meeID	;
    private long lead_id	;
    private long ACID	;

    private String mee_old_owner_user	;
    private String mee_old_brn_code	;
    private String PROMISE_BRANCH_CODE ;
    private String PROMISE_BRANCH_DESC ;
    private int TRANS_DATE ;
    private int TRANS_TIME ;
    private float CONTRACT_NO ;
    private int CARD_ID	;
    private String GROUP_STATUS	;
    private String ACTION_STATUS  ;
    private Date PROMISE_DATE ;
    private Time PROMISE_TIME ;
    private String TELEPHONE_NO ;
    private String REMARK_TEXT ;
    private String PROMISE_CVCMO_ID ;
    private String REASON_CODE ;
    private String PROMISE_USER ;
    private String REF_CODE ;
    private String Product_type ;

    public Meetings(long meeID,long lead_id,long ACID,
                    String mee_old_owner_user,String mee_old_brn_code,
                    String PROMISE_BRANCH_CODE,String PROMISE_BRANCH_DESC,
                    int TRANS_DATE,int TRANS_TIME,float CONTRACT_NO,
                    int CARD_ID,String GROUP_STATUS,String ACTION_STATUS,
                    Date PROMISE_DATE,Time PROMISE_TIME,String TELEPHONE_NO,
                    String REMARK_TEXT,String PROMISE_CVCMO_ID,String REASON_CODE,
                    String PROMISE_USER,String REF_CODE,String product_type) {

        this.meeID = meeID;
        this.lead_id = lead_id;
        this.ACID = ACID;
        this.mee_old_owner_user = mee_old_owner_user;
        this.mee_old_brn_code = mee_old_brn_code;
        this.PROMISE_BRANCH_CODE = PROMISE_BRANCH_CODE;
        this.PROMISE_BRANCH_DESC = PROMISE_BRANCH_DESC;
        this.TRANS_DATE = TRANS_DATE;
        this.TRANS_TIME = TRANS_TIME;
        this.CONTRACT_NO = CONTRACT_NO;
        this.CARD_ID = CARD_ID;
        this.GROUP_STATUS = GROUP_STATUS;
        this.ACTION_STATUS = ACTION_STATUS;
        this.PROMISE_DATE = PROMISE_DATE;
        this.PROMISE_TIME = PROMISE_TIME;
        this.TELEPHONE_NO = TELEPHONE_NO;
        this.REMARK_TEXT = REMARK_TEXT;
        this.PROMISE_CVCMO_ID = PROMISE_CVCMO_ID;
        this.REASON_CODE = REASON_CODE;
        this.PROMISE_USER = PROMISE_USER;
        this.REF_CODE = REF_CODE;
        this.Product_type = product_type;
    }
}
