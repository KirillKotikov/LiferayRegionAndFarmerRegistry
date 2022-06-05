create index IX_411E3D56 on entity_Farmer (farmer_archive_status);
create index IX_9122F112 on entity_Farmer (farmer_name);
create index IX_9DC036AF on entity_Farmer (uuid_);

create index IX_4C7D3774 on entity_Region (region_archive_status);
create index IX_BFB058B0 on entity_Region (region_name);
create index IX_FCE1B23E on entity_Region (uuid_);

create index IX_3CAC0DCD on entity_Regions_Farmers (farmer_id);
create index IX_143FA8DC on entity_Regions_Farmers (region_id);

create index IX_4B07C58D on entity_regions_farmers (farmer_id);
create index IX_229B609C on entity_regions_farmers (region_id);