<template>
  <h2>존재하지 않는 경로</h2>
  <p>요청경로 : {{ currentRoute.path }}</p>
</template>

<script setup>
import { useRoute, useRouter } from 'vue-router';

const currentRoute = useRoute();
</script>

<style lang="scss" scoped></style>
