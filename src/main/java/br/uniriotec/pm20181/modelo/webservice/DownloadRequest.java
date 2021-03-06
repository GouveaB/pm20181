package br.uniriotec.pm20181.modelo.webservice;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.Persister;

import java.io.ByteArrayOutputStream;

@Root(name = "download-request")
public class DownloadRequest {
    private DownloadRequest(){}
    private DownloadRequest(Builder builder) {
        this.motorId = builder.motorId;
        this.format = builder.format;
    }

    @Element(name = "motor-id") private Long motorId;
    @Element(name = "format") private String format;

    public String toXml() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            new Persister().write(this, os);
            return new String(os.toByteArray(),"ISO-8859-1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static class Builder {
        private Long motorId = 0L;
        private String format = "RockSim";

        public Builder withMotorId(Long id) {
            this.motorId = id;
            return this;
        }

        public DownloadRequest build() {
            return new DownloadRequest(this);
        }
    }
}
