create table entity_Farmer (
	uuid_ VARCHAR(75) null,
	farmer_id LONG not null primary key,
	farmer_name VARCHAR(75) null,
	farmer_legal_form VARCHAR(75) null,
	farmer_inn LONG,
	farmer_kpp LONG,
	farmer_ogrn LONG,
	farmer_registration_region_name VARCHAR(75) null,
	farmer_registration_date DATE null,
	farmer_archive_status BOOLEAN
);

create table entity_Region (
	uuid_ VARCHAR(75) null,
	region_id LONG not null primary key,
	region_name VARCHAR(75) null,
	region_code LONG,
	region_archive_status BOOLEAN
);

create table entity_Regions_Farmers (
	farmer_id LONG not null,
	region_id LONG not null,
	primary key (farmer_id, region_id)
);

create table entity_regions_farmers (
	farmer_id LONG not null,
	region_id LONG not null,
	primary key (farmer_id, region_id)
);