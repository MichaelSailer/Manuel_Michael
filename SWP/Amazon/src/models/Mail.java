package models;
import java.util.properties;

public class Mail {
    private Customer _mail;
    private BasketItem _bestellung;
    private  Basket _bestellnummer;

    public Customer getMail(){
        return this._mail;
    }
    public void setMail(Customer mail){
        this._mail  = mail;
    }
    public BasketItem getBestellung(){
        return this._bestellung;
    }
    public void setBestellung(BasketItem bestellung){
        this._bestellung = bestellung;
    }
    public Basket getBestellnummer(){
        return this._bestellnummer;
    }
    public void setBestellnummer(Basket bestellnummer){
        this._bestellnummer = bestellnummer;
    }
    public String getSmtpHost(){return this._smtpHost;}

    public Mail(){this(null, null, null);}
    public Mail(Customer mail, BasketItem bestellung, Basket bestellnumer){
        this.setMail(mail);
        this.setBestellung(bestellung);
        this.setBestellnummer(bestellnumer);
    }

    @Override

    public String toString(){
        return "E-Mail:" + this.getMail().toString() +  "Bestellung:" + " " + this.getBestellung().toString() + " " +"Bestellnummer:" + this.getBestellnummer();
    }
    /*private void createPaymentForEMail(){

        protected Session mailSession;

        public void login(String smtpHost, String smtpPort, String username, String password){
            Properties props = new Properties();
            props.put("mail.smtp.host", smtpHost);
            props.put("mail.smtp.socketFactory.port", smtpPort);
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", smtpPort);

            Authenticator auth = new Authenticator(){
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return newPasswordAuthentication(username, password);
                }
            };

            this.MailSession = Session.getDefaultInstance(props, auth);
            out.println("Eingeloggt.");
        }

        public void send(String senderMail, String senderName, String receiverAddresse, String subject, String message) throws MessagingException, IllegalStateException {
            if(mailSession == null){
                throw new IllegalStateException("Du musst dich zuerst einloggen!");
            }

            MimeMessage msg = new MimeMessage(mailSession);
            msg.addHeader("Content-type", "text/HTML; charset:UTF - 8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress(senderMail, senderName));
            msg.setReplyTo(InternetAddress.parse(senderMail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setSentDate(new Date());

            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverAddress, false));

            out.println("Versende E-Mail...");
            Transport.send(msg);
            out.println("E-Mail versendet!");

        }
    }
    */
}

