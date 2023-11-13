package org.example.lab_05.hw_01;

public enum errorHTTP {
    _400("Bad Request"),
    _401("Unauthorized"),
    _402("Payment Required"),
    _403("Forbidden"),
    _404("Not Found"),
    _405("Method Not Allowed"),
    _406("Not Acceptable"),
    _407("Proxy Authentication Required"),
    _408("Request Timeout"),
    _409("Conflict"),
    _410("Gone"),
    _411("Length Required"),
    _412("Precondition Failed"),
    _413("Request Entity Too Large"),
    _414("Request-URI Too Long"),
    _415("Unsupported Media Type"),
    _416("Requested Range Not Satisfiable"),
    _417("Expectation Failed");

    private String str;

    errorHTTP(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
