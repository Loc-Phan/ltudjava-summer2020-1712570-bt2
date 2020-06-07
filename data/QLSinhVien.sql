CREATE DATABASE IF NOT EXISTS quanlysinhvien;
USE quanlysinhvien;

CREATE TABLE giaovien(
	MaGV int NOT NULL primary key,
    HoTen varchar(255) NOT NULL,
    TenDN varchar(255) NOT NULL,
    MatKhau varchar(255) NOT NULL,
    SDT int NOT NULL,
    DiaChi varchar(255)
);

CREATE TABLE monhoc(
	MaMon varchar(255) NOT NULL primary key,
    TenMon varchar(255) NOT NULL,
    PhongHoc varchar(255) NOT NULL,
    Lop int
);

CREATE TABLE sinhvien(
	MaSV int NOT NULL,
    MSSV varchar(255) NOT NULL,
    HoTen varchar(255) NOT NULL,
    GioiTinh varchar(255),
    CMND varchar(255),
    MatKhau varchar(255) NOT NULL,
	Lop int not null,
    constraint sinhvien_pk primary key (MaSV,MSSV)
);

CREATE TABLE lophoc(
	MaLop int NOT NULL primary key,
    TenLop varchar(255),
    LaLopHoc tinyint(1)
);

CREATE TABLE loptheomon(
	ID int NOT NULL primary key,
    MaLopTheoMon varchar(255) NOT NULL,
    Mon varchar(255) NOT NULL,
    Lop int NOT NULL,
    SinhVien int NOT NULL,
    DiemGK float NOT NULL,
    DiemCK float NOT NULL,
    DiemKhac float NOT NULL,
    DiemTong float NOT NULL
);

CREATE TABLE phuckhao(
	MaPhucKhao int NOT NULL primary key,
    NgayBatDau date not null,
    NgayKetThuc date not null
);

CREATE TABLE chitietphuckhao(
	ID int not null primary key,
    MaPhucKhao int not null,
    MSSV varchar(255) not null,
    HoTen varchar(255) not null,
    Mon varchar(255) not null,
    CotDiem varchar(255) not null,
    DiemMongMuon float not null,
    LyDo varchar(255),
    TrangThai int(11)
);

alter table monhoc ADD FOREIGN KEY(Lop) REFERENCES lophoc(MaLop);
alter table loptheomon ADD FOREIGN KEY(Lop) REFERENCES lophoc(MaLop);
alter table sinhvien ADD FOREIGN KEY(Lop) REFERENCES lophoc(MaLop);
alter table chitietphuckhao ADD FOREIGN KEY(MaPhucKhao) REFERENCES PhucKhao(MaPhucKhao);
alter table chitietphuckhao ADD FOREIGN KEY(Mon) REFERENCES monhoc(MaMon);
alter table loptheomon ADD FOREIGN KEY(Mon) REFERENCES monhoc(MaMon);
alter table loptheomon ADD FOREIGN KEY(SinhVien	) REFERENCES sinhvien(MaSV);



