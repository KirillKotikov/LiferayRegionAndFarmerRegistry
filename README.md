## Liferay Regions and Farmers Registry Portlet

---
### Описание:

В даннном портлете реализован реестр районов и фермеров.
Есть возможность добавления новых записей, редактирование, изменение статуса архивности.

---
Использованные технологии:
- Java Programming Language (Java SE Development Kit 7u80);
- Maven;
- PostgreSQL 9.6.23;
- Liferay-portal-tomcat-6.2-ce-ga6;
---
Инструкция по запуску:
1) Для запуска вам потребуется вышеуказанные технологии;
2) Создать базу данных с именем lportal и указать её в настройках liferay;
3) Задеплоить файл-портлет под названием _LiferayRegionAndFarmerRegistry-portlet-1.0-SNAPSHOT.war_ в Liferay,
   который находится по пути _LiferayRegionAndFarmerRegistry-portlet/target_;
4) Также можно самостоятельно собрать _war_ файл-портлет скачав проект, в пути проекта вызвать команду _mvn clean package_ и проделать вышеуказанные действия;
5) Запусть Liferay и подключить портлет к порталу;
6) Ну вот вроде и всё, можно тестить :)
