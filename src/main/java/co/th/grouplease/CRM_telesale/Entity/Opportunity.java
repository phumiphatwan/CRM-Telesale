package co.th.grouplease.CRM_telesale.Entity;

import co.th.grouplease.CRM_telesale.Common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.sql.Time;

@Getter
@Setter
@Entity(name = "Opportunity")
@Table(name = "opportunity")

public class Opportunity extends BaseEntity {

    private long OPID ;
    private long ACID ;
    private String OP_RECORD_STATUS ;

    private int TRANS_DATE ;
    private int TRANS_TIME ;
    private float CONTRACT_NO ;
    private int CARD_ID ;
    private String OWNER_USER ;
    private String GROUP_STATUS ;
    private String ACTION_STATUS ;
    private Date PROMISE_DATE ;
    private Time PROMISE_TIME ;
    private String PROMISE_BRANCH_CODE ;
    private String PROMISE_BRANCH_DESC ;
    private String TELEPHONE_NO ;
    private String REMARK_TEXT ;
    private String PROMISE_CVCMO_ID ;
    private String REASON_CODE ;
    private String PROMISE_USER ;
    private String REF_CODE ;
    private String Product_type ;


    public Opportunity(long OPID, long ACID, String OP_RECORD_STATUS, int TRANS_DATE,
                       int TRANS_TIME, float CONTRACT_NO, int CARD_ID, String OWNER_USER,
                       String GROUP_STATUS, String ACTION_STATUS, Date PROMISE_DATE,
                       Time PROMISE_TIME, String PROMISE_BRANCH_CODE, String PROMISE_BRANCH_DESC,
                       String TELEPHONE_NO, String REMARK_TEXT, String PROMISE_CVCMO_ID,
                       String REASON_CODE, String PROMISE_USER, String REF_CODE,
                       String product_type, Date MTN_CREATE_DATE, Date MTN_TRN_DATE,
                       String MTN_TRN_FROM, String MTN_TERMINAL_ID, String MTN_PROGRAM_ID,
                       float MTN_BRANCH_CODE, String MTN_USER_ID, Date MTN_DATE_TIME) {

        this.OPID = OPID;
        this.ACID = ACID;
        this.OP_RECORD_STATUS = OP_RECORD_STATUS;
        this.TRANS_DATE = TRANS_DATE;
        this.TRANS_TIME = TRANS_TIME;
        this.CONTRACT_NO = CONTRACT_NO;
        this.CARD_ID = CARD_ID;
        this.OWNER_USER = OWNER_USER;
        this.GROUP_STATUS = GROUP_STATUS;
        this.ACTION_STATUS = ACTION_STATUS;
        this.PROMISE_DATE = PROMISE_DATE;
        this.PROMISE_TIME = PROMISE_TIME;
        this.PROMISE_BRANCH_CODE = PROMISE_BRANCH_CODE;
        this.PROMISE_BRANCH_DESC = PROMISE_BRANCH_DESC;
        this.TELEPHONE_NO = TELEPHONE_NO;
        this.REMARK_TEXT = REMARK_TEXT;
        this.PROMISE_CVCMO_ID = PROMISE_CVCMO_ID;
        this.REASON_CODE = REASON_CODE;
        this.PROMISE_USER = PROMISE_USER;
        this.REF_CODE = REF_CODE;
        this.Product_type = product_type;
    }
}
