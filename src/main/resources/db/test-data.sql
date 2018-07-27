DELETE FROM user;
INSERT INTO user(ID, CREATIONTIME, UPDATETIME, VERSION, NAME , LOCAL , CONTACT, PASSWORD, PHOTO, themePreferences, foodPreferences) VALUES
  (1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Mariana', 'LISBOA', 'mariana@gmail.com', '123', '999999991', 'IKEA Chairs','FaustinoVeganStyle'),
  (2, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Barata', 'Sines', 'barata@gmail.com', '123', '999999992', 'IKEA Chairs', 'FaustinoVeganStyle'),
  (3, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Maria', 'FUNDAO', 'maria@gmail.com', '123', '999999993', 'BrunoSpecialDoll', 'Pizza'),
  (4, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Bijuca', 'Porto', 'bijuca@gmail.com', '123', '999999994', 'BrunoSpecialDoll', 'Pizza'),
  (5, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Rute', 'LISBOA', 'rute@gmail.com', '123', '999999995', 'IKEA Chairs','FaustinoVeganStyle');


DELETE FROM requests;
INSERT INTO requests( ID, userId_id, CREATIONTIME, UPDATETIME, VERSION, STATE, DESTID, MATCHES) VALUES
  (1, 1, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2,1 , 2, null),
  (2, 2, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2,1 , 3, null),
  (3, 3, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2,1 , 4, null),
  (4, 4, TIMESTAMP '2017-10-10 10:18:53.819', TIMESTAMP '2017-10-10 10:22:58.578', 2,1 , 1, null);

