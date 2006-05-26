/*
 * Copyright 2005-2006 Noelios Consulting.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.txt
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * http://www.opensource.org/licenses/cddl1.txt
 * If applicable, add the following below this CDDL
 * HEADER, with the fields enclosed by brackets "[]"
 * replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 */

package org.restlet.data;

/**
 * Enumeration of connector protocols.
 * @author Jerome Louvel (contact@noelios.com) <a href="http://www.noelios.com/">Noelios Consulting</a>
 */
public enum Protocols implements Protocol
{
   /** AJP 1.3 protocol to communicate with Apache HTTP server or Microsoft IIS. */
   AJP,
   
   /** HTTP protocol. */
   HTTP,
   
   /** HTTPS protocol (via SSL socket). */
   HTTPS,
   
   /** JDBC protocol. */
   JDBC,
   
   /** SMTP protocol. */
   SMTP,
   
   /** SMTP with STARTTLS protocol (started with a plain socket). */
   SMTP_STARTTLS,
   
   /** SMTPS protocol (via SSL/TLS socket). */
   SMTPS;

   /**
	 * Returns the URI scheme name. 
	 * @return The URI scheme name.
	 */
	public String getSchemeName()
	{
      String result = null;

      switch(this)
      {
         case AJP:
            result = "ajp";
            break;
         case HTTP:
            result = "http";
            break;
         case HTTPS:
            result = "https";
            break;
         case JDBC:
            result = "jdbc";
            break;
         case SMTP:
            result = "smtp";
            break;
         case SMTP_STARTTLS:
         	result = "smtp";
         	break;
         case SMTPS:
            result = "smtps";
            break;
      }

      return result;
	}

	/**
	 * Returns the default port number.
	 * @return The default port number.
	 */
	public int getDefaultPort()
	{
      int result = -1;

      switch(this)
      {
         case AJP:
            result = 8009;
            break;
         case HTTP:
            result = 80;
            break;
         case HTTPS:
            result = 443;
            break;
         case JDBC:
            result = -1;
            break;
         case SMTP:
            result = 25;
            break;
         case SMTP_STARTTLS:
         	result = 25;
         	break;
         case SMTPS:
            result = 465;
            break;
      }

      return result;
	}

	/**
	 * Returns the name (ex: "HTTP", "SMTP").
	 * @return The name (ex: "HTTP", "SMTP").
	 */
   public String getName()
   {
      String result = null;

      switch(this)
      {
         case AJP:
            result = "AJP";
            break;
         case HTTP:
            result = "HTTP";
            break;
         case HTTPS:
            result = "HTTPS";
            break;
         case JDBC:
            result = "JDBC";
            break;
         case SMTP:
            result = "SMTP";
            break;
         case SMTP_STARTTLS:
         	result = "SMTP_STARTTLS";
         	break;
         case SMTPS:
            result = "SMTPS";
            break;
      }

      return result;
   }

	/**
	 * Returns the description.
	 * @return The description.
	 */
   public String getDescription()
   {
      String result = null;

      switch(this)
      {
         case AJP:
            result = "Apache Jakarta Protocol";
            break;
         case HTTP:
            result = "HyperText Transport Protocol";
            break;
         case HTTPS:
            result = "HyperText Transport Protocol (Secure)";
            break;
         case JDBC:
            result = "Java DataBase Connectivity";
            break;
         case SMTP:
            result = "Simple Mail Transfer Protocol";
            break;
         case SMTP_STARTTLS:
         	result = "Simple Mail Transfer Protocol (starting a TLS encryption)";
         	break;
         case SMTPS:
            result = "Simple Mail Transfer Protocol (Secure)";
            break;
      }

      return result;
   }

   /**
    * Sets the name of this REST element.
    * @param name The name of this REST element.
    */
   public void setName(String name)
   {
   	// Read-only
   }

   /**
    * Sets the description of this REST element.
    * @param description The description of this REST element.
    */
   public void setDescription(String description)
   {
   	// Read-only
   }

   /**
    * Indicates if the protocol is equal to a given one.
    * @param protocol The protocol to compare to.
    * @return True if the protocol is equal to a given one.
    */
   public boolean equals(Protocol protocol)
   {
      return protocol.getName().equalsIgnoreCase(getName());
   }

}
