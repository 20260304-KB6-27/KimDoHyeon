<template>
  <div class="container">
    <h2>About</h2>
    <p>요청 경로 : {{ route.fullPath }}</p>
  </div>
</template>

<script setup>
import { useRouter, useRoute } from 'vue-router';
const route = useRoute();
const router = useRouter();
console.log(router);
</script>

<style>
.container {
  text-align: center;
  margin-top: 10px;
}
</style>
