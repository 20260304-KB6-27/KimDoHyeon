let p = new Promise((resolve, reject) => {
  resolve('first!');
});
p.then((msg) => {
  console.log(msg);
  return [msg, 'second', 'third'];
})
  .then((msg) => {
    console.log(msg[1]);
    console.log(msg[2]);
  })
  .catch((error) => {
    console.log('오류 발생 ==> ' + error);
  });
