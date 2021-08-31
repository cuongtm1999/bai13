package entity;

import java.util.Date;

public class Certificate {
    private String certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certifiticateDate;

    public Certificate() {
    }

    public Certificate(String certificatedID, String certificateName, String certificateRank, Date certifiticateDate) {
        super();
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certifiticateDate = certifiticateDate;
    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Date getCertifiticateDate() {
        return certifiticateDate;
    }

    public void setCertifiticateDate(Date certifiticateDate) {
        this.certifiticateDate = certifiticateDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificatedID='" + certificatedID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certifiticateDate=" + certifiticateDate +
                '}';
    }
}
