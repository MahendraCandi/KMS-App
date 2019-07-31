/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keongpuyeng.app.kms.app;

import com.google.gson.Gson;
import com.keongpuyeng.app.kms.app.configuration.AppConfig;
import com.keongpuyeng.app.kms.app.controller.UserController;
import com.keongpuyeng.app.kms.app.dao.ProgramDao;
import com.keongpuyeng.app.kms.app.dao.SiswaDao;
import com.keongpuyeng.app.kms.app.dao.UserDao;
import com.keongpuyeng.app.kms.app.model.KonfirmasiDto;
import com.keongpuyeng.app.kms.app.model.KonfirmasiPembayaran;
import com.keongpuyeng.app.kms.app.model.Kursus;
import com.keongpuyeng.app.kms.app.model.Level;
import com.keongpuyeng.app.kms.app.model.Program;
import com.keongpuyeng.app.kms.app.model.SiswaDto;
import com.keongpuyeng.app.kms.app.service.IGenerateReport;
import com.keongpuyeng.app.kms.app.service.IKonfirmasiService;
import com.keongpuyeng.app.kms.app.service.IMailService;
import com.keongpuyeng.app.kms.app.service.IPendaftaranService;
import com.keongpuyeng.app.kms.app.service.ISiswaService;
import com.keongpuyeng.app.kms.app.service.IUserService;
import java.io.File;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.Tika;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Aldis-PC
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {AppConfig.class})
//@WebAppConfiguration
public class Testing {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private IUserService userService;

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private SiswaDao siswaDao;
    
    @Autowired
    private IPendaftaranService pendService;
    
    @Autowired
    private ProgramDao programDao;
    
    @Autowired
    private ISiswaService siswaService;
    
    @Autowired
    private IMailService mailService;
    
    @Autowired
    private IKonfirmasiService konfirmService;
    
    @Autowired
    private IGenerateReport report;
    
    private MockMvc mockMvc;

//    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
//    
//    @Test
//    @Transactional
    public void myTesting() throws Exception{
        String myPath = this.getClass().getClassLoader().getResource("").toString();
        System.out.println("PATH: " + myPath);
//        konfirmService.getKonfirmasiForm("S-0005");
        

//        report.generatePdfReportSiswa("naruto");

    

//        List<Object> search =  Arrays.asList(siswaDao.searchTemp("pria"));
//        
//        for (Object object : search) {
//            Object[] obj = (Object[]) object;
//            System.out.println("OBJ: " + obj[0]);
//            System.out.println("OBJ: " + obj[1]);
//            System.out.println("OBJ: " + obj[2]);
//            System.out.println("OBJ: " + obj[3]);
//            System.out.println("OBJ: " + obj[4]);
//            System.out.println("OBJ: " + obj[5]);
//            System.out.println("OBJ: " + obj[6]);
//        }
//        
//        
//        System.out.println(search);
        
        
        
        
        
        
        
        
//        File file = new ClassPathResource("fmtemplates/logo.png").getFile();
//        
//        
//        System.out.println("FILE: " + file.getPath());
//        System.out.println("FILE: " + file.getCanonicalPath());
//        System.out.println("FILE: " + file.getAbsolutePath());
//        System.out.println("FILE: " + file.getName());
//        System.out.println("FILE: " + file.exists());
//        
////        KonfirmasiPembayaran konfirmasiPembayaran = new KonfirmasiPembayaran();
////        konfirmasiPembayaran.setTglKonfirmasi(new Date());
////        
////        System.out.println("KONFIRMASI: " + new Gson().toJson(konfirmasiPembayaran));
////
//
////        ServletContext servletContext = wac.getServletContext();
//        SiswaDto siswa = new SiswaDto();
//        Program program = new Program();
//        Kursus kursus = new Kursus();
//        Level level = new Level();
//        
//        HashMap<String, Object> model = new HashMap();
//        KonfirmasiPembayaran konfirmasi = new KonfirmasiPembayaran();
//        siswa.setIdDaftar("D-009");
//        siswa.setIdSiswa("S-009");
//        siswa.setEmailDaftar("muhammad.abdu@indocyber.co.id");
//        siswa.setNamaDaftar("Candi Mahendra");
////        siswa.setEmailDaftar("aldisirhamirizki@gmail.com");
////        siswa.setNamaDaftar("Aldis Irhami Rizki");
////        DateTimeFormatter dtf = DateTimeFormat.forPattern("EEEE, dd MMMM yyyy").withLocale(Locale.forLanguageTag("id-ID"));
////        DateTimeFormatter dtf2 = DateTimeFormat.forPattern("dd-MM-yyyy");
////        LocalDateTime dt = LocalDateTime.parse("31-01-1990", dtf2);
////        siswa.setTanggalLahir(dt.toDate());
//        siswa.setJenisKelamin("Pria");
//        siswa.setTelepon("089999888800");
//        siswa.setTempatTinggal("Ciledug");
//        program.setNamaProgram("Profesional");
//        program.setBiaya(200000);
//        kursus.setNamaKursus("Guitar");
//        kursus.setBiaya(100000);
//        level.setNamaLevel("Beginner");
//        level.setBiaya(175000);
//        konfirmasi.setTotalBiaya(150000);
//        
//        model.put("siswa", siswa);
//        model.put("program", program);
//        model.put("kursus", kursus);
//        model.put("level", level);
//        model.put("konfirmasi", konfirmasi);
//        mailService.sendMail(model, siswa.getEmailDaftar());
//        
        
//        Siswa siswa = siswaService.getSiswaByIdDaftar("D-0001");
//        
//        System.out.println("INI SISWA: " + siswa.toString());
//        System.out.println("JENIS KELAMIN: " + siswa.getJenisKelamin().name());
//        String x = new Gson().toJson(siswa);
//        System.out.println("XXX " + x);
        
        
        
//        List<User> listUser = userService.getUsers();
//        
//        String id = null;
//        if (listUser.isEmpty()) {
//            id = "U-01";
//        }
//        else {
//            DecimalFormat formatId = new DecimalFormat("U-00");
//            String nomorUrut = listUser.stream().reduce((first, second) -> second).orElse(null).getIdUser().substring(2);
//            id=formatId.format(Double.parseDouble(nomorUrut)+1);
//        }
        
//        User us = new User();
//        us.setIdUser(id);
//        us.setNamaUser("sss");
//        us.setEmailUser("wewewew");
//        us.setPasswordUser("qwqwqw");
//        
//        String json = new Gson().toJson(us);
//        
//        System.out.println(json);
//        
//        userService.saveUser(us);
//        System.out.println("sssssss" + getId );
            
            
            
            
            
            
            
//        ServletContext servletContext = wac.getServletContext();
//        Enumeration<String> list = servletContext.getAttributeNames();
//        List<String> listT = Collections.list(list);
//        
//        listT.forEach(p -> {
//            System.out.println("vvvvvvv" + p);
//        });
//        
//        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
////        scanner.addIncludeFilter(new AnnotationTypeFilter());
//        for (BeanDefinition beanDefinition : scanner.findCandidateComponents("com.keongpuyeng.app.kms.app.controller")){
//            System.out.println("Bean: " + beanDefinition.getBeanClassName());
//        }
//        
//        System.out.println();
        
        
        
//        System.out.println("Start testing...");
//
//        Binatang ayam = new Binatang("dua", "berkokok", "beras", "unggas");
//        System.out.println("--" + ayam.getKaki());
//        System.out.println(ayam.getSuara());
//        System.out.println(ayam.getMakanan());
//        System.out.println(ayam.getJenis());
//
//        Binatang sapi = new Binatang("empat", "mouu", "rumput", "mamalia");
//
//        List<Binatang> daftarBinatang = new ArrayList<>();
//        daftarBinatang.add(sapi);
//        daftarBinatang.add(ayam);
//
//        Binatang ayamClone = daftarBinatang.get(1);
//        System.out.println("apa ini" + daftarBinatang.get(1));
//
//        System.out.println("apaan sih " + daftarBinatang.size());
//
//        System.out.println(ayamClone.getKaki());
//        System.out.println(ayamClone.getSuara());
//        System.out.println(ayamClone.getMakanan());
//        System.out.println(ayamClone.getJenis());
//
//        Binatang binatang = null; 
//        
//        for (int i = 0; i < daftarBinatang.size(); i++) {
//            binatang = daftarBinatang.get(i);
//            System.out.println(binatang.getKaki());
//            System.out.println(binatang.getSuara());
//            System.out.println(binatang.getMakanan());
//            System.out.println(binatang.getJenis());
//        }
//
//        // create 10 user
//        List<User> users = userService.getUsers();
//        long usersCount = users.stream().count();
//        System.out.println("Users Count: " + usersCount);
//        int max = 10;
//        if (users.isEmpty()) {
//            int i = 0;
//            do {
//                User user = new User();
//                user.setIdUser("Id-" + String.valueOf(i));
//                user.setNamaUser("Android-" + String.valueOf(i));
//                user.setEmailUser("test.user" + String.valueOf(i) + "@gmail.com");
//                user.setPasswordUser(String.valueOf(i) + "abcd" + String.valueOf(i));
//                userService.saveUser(user);
//                i++;
//            } while (i < max);
//        } else {
//            User u = users.stream().reduce((first, second) -> second).orElse(null);
//            System.out.println("Id: " + u.getIdUser());
//            int lastIdNumber = Integer.parseInt(u.getIdUser().substring(3));
//            max = lastIdNumber + 10;
//            do {
//                User user = new User();
//                user.setIdUser("Id-" + String.valueOf(lastIdNumber));
//                user.setNamaUser("Android-" + String.valueOf(lastIdNumber));
//                user.setEmailUser("test.user" + String.valueOf(lastIdNumber) + "@gmail.com");
//                user.setPasswordUser(String.valueOf(lastIdNumber) + "abcd" + String.valueOf(lastIdNumber));
//                userService.saveUser(user);
//                lastIdNumber++;
//            } while (lastIdNumber < max);
//        }
//
//        users = userService.getUsers();
//        users.stream().forEach(p -> {
//            System.out.println(p.getIdUser());
//            System.out.println(p.getNamaUser());
//            System.out.println(p.getEmailUser());
//            System.out.println(p.getPasswordUser());
//            System.out.println("----------------------------");
//        });
    }
}
