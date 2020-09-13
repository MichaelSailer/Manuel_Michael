using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Web;

namespace WebApp_3a_02.Models
{
    public class User{

        private double _height;

        // automatische properties
        public string Firstname { get; set; }
        public string Lastname { get; set; }
        public string EMail { get; set; }
        public string Password { get; set; }
        public string Password2 { get; set; }
        public DateTime Birthday { get; set; }

        // normale properties

        public double Height{
            get { return this._height; }
            set { 
                // value entspricht dem Parameter der set-Methode
                if(value >= 0.0){
                    this._height = value;
                }
            }
        }

        // ctor
        public User() :this("", "", "", DateTime.MinValue, 0.0){}
        public User(string firstname, string lastname, string mail, DateTime birthday, double height){
            this.Firstname = firstname;
            this.Lastname = lastname;
            this.EMail = mail;
            this.Birthday = birthday;
            this.Height = height;
            this.Password = "";
            this.Password2 = "";
        }



    }
}