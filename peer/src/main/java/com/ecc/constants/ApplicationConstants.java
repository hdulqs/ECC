package com.ecc.constants;

public class ApplicationConstants {
    //Server host
    public static final String SERVER_URL = "http://localhost:29601/";
    //Server PublicKey
    public static final String SERVER_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApf9baWq7gdES709Aqr4T4bqcV9NdSlFOCeBJ0SpB9xTAIPngTba/Dxu7pN3UR3z7FUH6E39HaCGRPmDmTbXKjktLeUgdoApagBJhYlMYYy3jS1Z4poicuBFJI+LSpfuduTZSTZK+uL+BFo0RvRUzyD7Oi9eeunyInTl2NKcnGsDsy1RHDXTYCYibSQN272MWlCQqNqz7scrYJ2W64MKtmDjMzjtMB+H2RSi0tQDdTjvr3m2pTEO6hF2Be1HeCDHY4qVn2Cx1a1lBXGOTArEoGMnU7GiZMkcEH4aUWkQuupqARIW1G15m4SEN/D8I3keYhmatyvhKcPY0IX5K3Vn7YQIDAQAB";
    public static final String SERVER_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCl/1tparuB0RLvT0CqvhPhupxX011KUU4J4EnRKkH3FMAg+eBNtr8PG7uk3dRHfPsVQfoTf0doIZE+YOZNtcqOS0t5SB2gClqAEmFiUxhjLeNLVnimiJy4EUkj4tKl+525NlJNkr64v4EWjRG9FTPIPs6L1566fIidOXY0pycawOzLVEcNdNgJiJtJA3bvYxaUJCo2rPuxytgnZbrgwq2YOMzOO0wH4fZFKLS1AN1OO+vebalMQ7qEXYF7Ud4IMdjipWfYLHVrWUFcY5MCsSgYydTsaJkyRwQfhpRaRC66moBEhbUbXmbhIQ38PwjeR5iGZq3K+Epw9jQhfkrdWfthAgMBAAECggEAEYuXDuJgJU2C8dZvoFxs34wI4GOP1b4YQIT7aGdOB56i3BltMumg8ijdQYTM3i2AoHOTyiHG22PI5U36qbYQTc/5jz0nHHZbsHPA5VKhHkKIZrsiD4AbCH2TPH7KAw9AUYZDVr2u+PoM2+RXPqQSEBVLYY6N0Wo+Slf7fX85a+NR5+t7y2nEUXxNI99DlQ1EJWMr07lCWYB15nz3ZSMJyOfOM0+7vRpymiWdYFq7pVJKE6Rpyxb/4tQ2e0jW7PZc1FoiG3zatJOlNmAn7ukDcg5bGK/Oj8DOp1B+RvRaxeAj+G+2IAGv4C391zVop+uruxws6XYKkWDtU6pvbowrAQKBgQD8tNe6G/0nElb2HyA8XKq3dDUyTLBbxsJiNQPajMc89TTYVEYGNjt5uAKhpsg/2RgbBNuozm+Nnr7wSBxjDWHsljPtUYMSDhKT7nIfTWqN1mjRlPE/Q2R0G/KpW4zXDyEKH5JR8zMsHXRJQZb3ydkWzS5kNPZ1OEFJ7RKPt5hXEQKBgQCoKTWRKP4v5ysxCfElDXWexvd151wU271safFPYSjmWKxme+HeWIkwzglzVEmKkhRaZ997+5BJXCxb7UZTLz5Iqg5q1Vgc6KCZ6lz8Jnn/EzFCWfucUundbx3klbxEjfxxNS/BCaZDYVZvwgnlftrzcqLCX9SF0p0Wrcu9xaV/UQKBgQCM4mF2v43mD4Jt2rKFFICUoHPb5AdaUzghuj64xE17fZUFmg4j/m4wENdeufXgKq8WuSGhPd3RTZRTr1AsJNTYKnEuuIfjM/dFg+UZ8HYcN1HerjPFOlQxqzchFgoyB5w64ZkYmQaJbK5c/PUmleCyppdbhG92sHMtvL7hYtDKkQKBgCuon06zvOLE+tK9iQ0cpHf3olHLIn4L2u8lxk/cotjDFud4rFik1eGE7LEzpfBDIuOh6kTvODPDqYSoYsTAFESbWijkgP7oaqHrVf7lInFWE0jtwcSBRlSGP9WUBpAp6OufammMzszZna5gS195AvGHxrf+V1fzKXO05Zu8j84xAoGBAOFSXyv7DTISabx8bjP1O6vKeuqS2skUUC4Jlfu2Ydc/+CpQ+RyhUMv4vRaV3nfu5j4uMeav/xQ46OkYeOH3NA2C1ii+4BSzr8/JfodPHyGOblXK/15PqxlPq7Udx7viEl0n7+uVUBRRu7SoHaoPRTZl0EkpZSPWTTcswxPX/cFh";

    //Hash algorithm
    public static final String HASH_ALGORITHM = "SHA-256";

    //Encrypt algorithm
    public static final String ENCRYPT_ALGORITHM_ASYMMETRIC = "RSA";
    public static final String ENCRYPT_ALGORITHM_SYMMETRIC = "AES/ECB/PKCS5Padding";
    public static final String ENCRYPT_ALGORITHM_SYMMETRIC_KEY_GENRATE = "AES";

    //Signature algorithm
    public static final String SIGN_ALGORITHM = "SHA256withRSA";

    //Paths
    public static final String PATH_BASE = "/Users/zhouzhixuan/Desktop/test0/";
    public static final String PATH_BLOCK = PATH_BASE + "block/";
    public static final String PATH_STATE_DB = PATH_BASE + "state_db/";
    public static final String PATH_KEY = PATH_BASE + "key/";
    public static final String PATH_STORE = PATH_BASE + "store/";
    public static final String PATH_DOWNLOAD = PATH_BASE + "download/";
    public static final String PATH_TEMP = PATH_BASE + "temp/";

    public static final String SUFFIX_BLOCK = ".block";
    public static final String SUFFIX_STATE_DB = ".state";
    public static final String SUFFIX_PRIVATE_KEY = ".private";
    public static final String SUFFIX_PUBLIC_KEY = ".public";
}
