select id, version, date_modified, param_name, param_value from properties_look_up

update properties_look_up set param_value = 60 where id = 1;
commit;

