package co.th.grouplease.CRM_telesale.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Customer")
@Table(name = "customer")


public class Customer {

    @Id
    @GeneratedValue
    private String Cust_contactID ;
    private String Cust_company ;
    private String Cust_id_card ;
    private String Cust_prefix ;
    private String Cust_fname ;
    private String Cust_lname ;
    private String Cust_birthdate ;
    private String Cust_job ;
    private float Cust_salary  ;
    private String Cust_adressNo ;
    private String Cust_soi ;
    private String Cust_road ;
    private String Cust_ampure ;
    private String Cust_tumbon ;
    private String Cust_province ;
    private String Cust_zipcode ;
    private String Cust_tel_1 ;
    private String Cust_tel_2 ;
    private String Cust_tel_3 ;
    private String Cust_status ;
    private int Cust_overdue ;
    private int Cust_remain ;
    private Date Cust_activeDate ;
    private Date Cust_closeDate ;
    private String Cust_band ;
    private String Cust_model ;
    private String cust_chasis_no ;
    private String cust_regis_no ;


    public Customer(String cust_contactID,String cust_company,
                    String cust_id_card,String cust_prefix,
                    String cust_fname,String cust_lname,
                    String cust_birthdate,String cust_job,
                    float cust_salary,String cust_adressNo,
                    String cust_soi,String cust_road,
                    String cust_ampure,String cust_tumbon,
                    String cust_province,String cust_zipcode,
                    String cust_tel_1,String cust_tel_2,
                    String cust_tel_3,String cust_status,
                    int cust_overdue,int cust_remain,
                    Date cust_activeDate,Date cust_closeDate,
                    String cust_band,String cust_model,
                    String cust_chasis_no,String cust_regis_no) {

        this.Cust_contactID = cust_contactID;
        this.Cust_company = cust_company;
        this.Cust_id_card = cust_id_card;
        this.Cust_prefix = cust_prefix;
        this.Cust_fname = cust_fname;
        this.Cust_lname = cust_lname;
        this.Cust_birthdate = cust_birthdate;
        this.Cust_job = cust_job;
        this.Cust_salary = cust_salary;
        this.Cust_adressNo = cust_adressNo;
        this.Cust_soi = cust_soi;
        this.Cust_road = cust_road;
        this.Cust_ampure = cust_ampure;
        this.Cust_tumbon = cust_tumbon;
        this.Cust_province = cust_province;
        this.Cust_zipcode = cust_zipcode;
        this.Cust_tel_1 = cust_tel_1;
        this.Cust_tel_2 = cust_tel_2;
        this.Cust_tel_3 = cust_tel_3;
        this.Cust_status = cust_status;
        this.Cust_overdue = cust_overdue;
        this.Cust_remain = cust_remain;
        this.Cust_activeDate = cust_activeDate;
        this.Cust_closeDate = cust_closeDate;
        this.Cust_band = cust_band;
        this.Cust_model = cust_model;
        this.cust_chasis_no = cust_chasis_no;
        this.cust_regis_no = cust_regis_no;
    }
}
