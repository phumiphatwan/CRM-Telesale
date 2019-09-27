package co.th.grouplease.CRM_telesale.Entity;

import co.th.grouplease.CRM_telesale.Common.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Loader;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Lead")
@Table(name = "lead")

public class Lead extends BaseEntity {



    private String L_RECORD_STATUS ;
    private int L_AS_YEAR ;
    private int L_AS_MONTH ;

    private String L_FIRST_NAME ;
    private String L_LAST_NAME ;
    private float CONTRACT_NO ;
    private int CARD_ID	;
    private String L_PHONE_NUMBER ;
    private String L_EMAIL ;
    private String L_BRAND_DSC ;
    private String L_MODEL_DSC ;
    private String L_TUMBON_CURRENT ;
    private String L_DISTRICT_CURRENT ;
    private String L_PROVINCE_CURRENT ;
    private String L_ZIPCODE ;
    private String L_COMPANY_TYPE ;
    private String L_CONVERT_ACCOUNT ;

    private Date MTN_CREATE_DATE ;
    private Date MTN_TRN_DATE ;
    private String MTN_TRN_FROM ;
    private String MTN_TERMINAL_ID ;
    private String MTN_PROGRAM_ID ;
    private float MTN_BRANCH_CODE ;
    private String  MTN_USER_ID ;
    private Date MTN_DATE_TIME ;


    public Lead(String l_RECORD_STATUS, int l_AS_YEAR, int l_AS_MONTH, String l_FIRST_NAME, String l_LAST_NAME,
                float CONTRACT_NO, int CARD_ID, String l_PHONE_NUMBER, String l_EMAIL, String l_BRAND_DSC,
                String l_MODEL_DSC, String l_TUMBON_CURRENT, String l_DISTRICT_CURRENT, String l_PROVINCE_CURRENT,
                String l_ZIPCODE, String l_COMPANY_TYPE, String l_CONVERT_ACCOUNT, Date MTN_CREATE_DATE, Date MTN_TRN_DATE,
                String MTN_TRN_FROM, String MTN_TERMINAL_ID, String MTN_PROGRAM_ID, float MTN_BRANCH_CODE,
                String MTN_USER_ID, Date MTN_DATE_TIME) {

        this.L_RECORD_STATUS = l_RECORD_STATUS;
        this.L_AS_YEAR = l_AS_YEAR;
        this.L_AS_MONTH = l_AS_MONTH;
        this.L_FIRST_NAME = l_FIRST_NAME;
        this.L_LAST_NAME = l_LAST_NAME;
        this.CONTRACT_NO = CONTRACT_NO;
        this.CARD_ID = CARD_ID;
        this.L_PHONE_NUMBER = l_PHONE_NUMBER;
        this.L_EMAIL = l_EMAIL;
        this.L_BRAND_DSC = l_BRAND_DSC;
        this.L_MODEL_DSC = l_MODEL_DSC;
        this.L_TUMBON_CURRENT = l_TUMBON_CURRENT;
        this.L_DISTRICT_CURRENT = l_DISTRICT_CURRENT;
        this.L_PROVINCE_CURRENT = l_PROVINCE_CURRENT;
        this.L_ZIPCODE = l_ZIPCODE;
        this.L_COMPANY_TYPE = l_COMPANY_TYPE;
        this.L_CONVERT_ACCOUNT = l_CONVERT_ACCOUNT;
        this.MTN_CREATE_DATE = MTN_CREATE_DATE;
        this.MTN_TRN_DATE = MTN_TRN_DATE;
        this.MTN_TRN_FROM = MTN_TRN_FROM;
        this.MTN_TERMINAL_ID = MTN_TERMINAL_ID;
        this.MTN_PROGRAM_ID = MTN_PROGRAM_ID;
        this.MTN_BRANCH_CODE = MTN_BRANCH_CODE;
        this.MTN_USER_ID = MTN_USER_ID;
        this.MTN_DATE_TIME = MTN_DATE_TIME;
    }



}
