CREATE DATABASE IF NOT EXISTS quanlysinhvien;
USE quanlysinhvien;

CREATE TABLE giaovien(
	MaGV int(12) NOT NULL primary key,
    HoTen varchar(255) NOT NULL,
    TenDN varchar(255) NOT NULL,
    MatKhau varchar(255) NOT NULL,
    SDT varchar(255),
    DiaChi varchar(255)
);

CREATE TABLE monhoc(
	MaMon varchar(255) NOT NULL primary key,
    TenMon varchar(255) NOT NULL,
    PhongHoc varchar(255) NOT NULL,
    Lop int(12) not null
);

CREATE TABLE sinhvien(
    MSSV varchar(255) NOT NULL,
    HoTen varchar(255) NOT NULL,
    GioiTinh varchar(255) not null,
    CMND varchar(255) not null,
    MatKhau varchar(255) NOT NULL,
	Lop int(12) not null,
    constraint sinhvien_pk primary key (MSSV)
);

CREATE TABLE lophoc(
	MaLop int(12) NOT NULL primary key,
    TenLop varchar(255) not null,
    LaLopHoc int(1) not null
);

CREATE TABLE loptheomon(
    MaLopTheoMon varchar(255) NOT NULL primary key,
    Mon varchar(255) NOT NULL,
    Lop int(12) NOT NULL,
    SinhVien int(12) NOT NULL,
    DiemGK float NOT NULL,
    DiemCK float NOT NULL,
    DiemKhac float NOT NULL,
    DiemTong float NOT NULL
);

CREATE TABLE phuckhao(
	MaPhucKhao int(12) NOT NULL primary key,
    NgayBatDau date not null,
    NgayKetThuc date not null
);

CREATE TABLE chitietphuckhao(
	ID int(12) not null primary key,
    MaPhucKhao int(12) not null,
    MSSV varchar(255) not null,
    HoTen varchar(255) not null,
    Mon varchar(255) not null,
    CotDiem varchar(255) not null,
    DiemMongMuon float not null,
    LyDo varchar(255) not null,
    TrangThai int(12) not null
);






