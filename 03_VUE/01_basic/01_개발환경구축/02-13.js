let obj = { result: 0 };

// // JavaScript this 바인딩 문제
// obj.add = function (x, y) {
//   function inner() {
//     // this?
//     this.result = x + y;
//   }

//   // 일반함수 호출 시에 this는 전역객체를 참조
//   // inner함수의 this는 global(node), window
//   inner();
// };
// obj.add(3, 4);

// console.log(obj);
// console.log(result);

// console.log(globalThis.result);

// 이러한 바인딩 문제를 해결하기 위해
// 1. 화살표 함수: 호출된 상위객체의 this
// obj.add = function (x, y) {
//   // 화살표 함수 안의 this: 상위 scope의 this
//   const inner = () => {
//     this.result = x + y;
//   };

//   inner();
// };
// obj.add(3, 4);
console.log(obj);

// 2. bind()로 명시적 바인딩
// 함수의 this 값을 특정 객체의 영구적으로 바인딩한 새로운 함수를 반환
// 첫번째 인자로 전달된 객체가 this로 설정됨.
obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  // inner 함수의 this를 obj 객체로 바인딩하여 호출
  inner.bind(obj)();
};

obj.add(3, 4);
console.log(obj);
