/* Insert statement for Currency */
INSERT INTO currency (id, entity_code, symbol, name, description) VALUES (1, 'USD', '$', 'US Dollar', 'US Dollar');

/* Insert statement for Location Type */
INSERT INTO locationtype (id, entity_code, name, description) VALUES (1, 'COUNTRY', 'Country', 'Country');
INSERT INTO locationtype (id, entity_code, name, description) VALUES (2, 'STATE', 'State', 'State');
INSERT INTO locationtype (id, entity_code, name, description) VALUES (3, 'CITY', 'City', 'City');

/* Insert statement for Location */
INSERT INTO location (location_type, entity_code, name, description) VALUES (1, 'KENYA', 'Kenya', 'Kenya');
INSERT INTO location (location_type, location, entity_code, name, description) VALUES (2, 1, 'NAIROBI', 'Nairobi', 'Nairobi');
INSERT INTO location (location_type, location, entity_code, name, description) VALUES (3, 2, 'NBO', 'Nairobi', 'Nairobi');

/* Insert statement for Party Category */
INSERT INTO partycategory (id, entity_code, name, description) VALUES (1, 'ORGANIZATION', 'Organization', 'Organizational party');
INSERT INTO partycategory (id, entity_code, name, description) VALUES (2, 'INDIVIDUAL', 'Individual', 'Individual party');

/* Insert statement for Party Type */
INSERT INTO partytype (party_category, entity_code, name, description) VALUES (1, 'ORGANIZATION', 'Organization', 'Organizational party');
INSERT INTO partytype (party_category, entity_code, name, description) VALUES (2, 'INDIVIDUAL', 'Individual', 'Individual party');

/* Insert statement for Role Type */
INSERT INTO roletype (entity_code, name, description) VALUES ('CLIENT', 'Client', 'Client');

INSERT INTO business (id, currency, entity_code, name, description) VALUES (1, 1, 'CLODERIA', 'Cloderia', 'Cloderia');
INSERT INTO business (id, currency, entity_code, name, description) VALUES (1, 1, 'CLODERIA', 'Cloderia', 'Cloderia');


INSERT INTO contenttype (entity_code, name, description) VALUES ('ACADEMIC_PAPER', 'Academic Paper', 'Academic Paper');
INSERT INTO contentstatus (entity_code, name, description) VALUES ('ACTIVE', 'Active', 'Active');

INSERT INTO contentordertype (entity_code, name, description) VALUES ('ACADEMIC_ASSIGNMENT', 'Academic Assignment', 'Academic Assignment');

INSERT INTO contentorderstatus (entity_code, name, description) VALUES ('PENDING', 'Pending', 'Pending');
INSERT INTO contentorderstatus (entity_code, name, description) VALUES ('IN_PROGRESS', 'In Progress', 'In Progress');
INSERT INTO contentorderstatus (entity_code, name, description) VALUES ('COMPLETED', 'Completed', 'Completed');

INSERT INTO businessunit(id, entity_code, currency, name, address_1, address_2, description, business) VALUES (1, 'DEFAULT_BUSINESS_UNIT', 1, 'Business Unit', 'One way', 'Kings Avenue', 'The business unit', 1)

INSERT INTO content(id, entity_code, name, content_type, document_type, subject_area, academic_level, numpages, description, party, status, business_unit) 
	VALUES ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8],[value-9],[value-10],[value-11],[value-12])
